package com.mjelen.blog.post;

import com.mjelen.blog.tag.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class PostControllerITest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PostService postService;


    @Test
    @WithMockUser
    void findAllTest() throws Exception {
        mockMvc.perform(get("/posts"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.length()").value(10))
                .andExpect(jsonPath("$.comments").doesNotExist())
                .andExpect(jsonPath("$.[0].tags.length()").value(3))
                .andExpect(jsonPath("$.[0].user").exists());
    }

    @Test
    @WithMockUser
    @Transactional
    void findById_withExistingId() throws Exception {
        long postId = 1;
        Post post = postService.findById(postId)
                .orElse(new Post());

        Set<Tag> tags = post.getTags();

        mockMvc.perform(get("/posts/{postId}", postId))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isFound())
                .andExpect(jsonPath("$.id").doesNotExist())
                .andExpect(jsonPath("$.title").value(post.getTitle()))
                .andExpect(jsonPath("$.content").value(post.getContent()))
                .andExpect(jsonPath("$.comments").doesNotExist())
                .andExpect(jsonPath("$.user").exists())
                .andExpect(jsonPath("$.tags.length()").value(tags.size()));
    }

    @ParameterizedTest
    @ValueSource(longs = {
            34541234345L, -213123L, 0L
    })
    @WithMockUser
    void findById_withBadId(Long id) throws Exception {
        mockMvc.perform(get("/posts/{postId}", id))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.status").value(404))
                .andExpect(jsonPath("$.message").value("Post not found, id: " + id))
                .andExpect(jsonPath("$.timestamp").exists());
    }
}
