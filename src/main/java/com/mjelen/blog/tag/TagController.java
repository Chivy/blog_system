package com.mjelen.blog.tag;

import com.mjelen.blog.post.PostService;
import com.mjelen.blog.tag.exception.TagNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/tags")
public class TagController {

    private TagService tagService;

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;

    }

    @GetMapping
    public ResponseEntity<Set<Tag>> getAllTags() {
        return new ResponseEntity<>(tagService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Tag> getTagByName(@PathVariable String name) {
        Tag foundTag = tagService.findByName(name)
                .orElseThrow(() -> new TagNotFoundException("Tag with name: " + name + "doesn't exist"));

        return new ResponseEntity<>(foundTag, HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<Tag> addNewTag(@RequestBody Tag tag) {
        return new ResponseEntity<>(
                tagService.save(tag), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Tag> deleteTagByName(@PathVariable String name) {
        Tag deleted = tagService.findByName(name)
                .orElseThrow(() -> new TagNotFoundException("Tag with name: " + name + "doesn't exist"));

        tagService.deleteByName(name);

        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tag> updateTag(@RequestBody Tag tag, @PathVariable Long id) {
        Tag tagToUpdate = tagService.findById(id)
                .orElseThrow(() -> new TagNotFoundException("Tag with id: " + id + "doesn't exist"));
        return new ResponseEntity<>(
                tagService.update(tag), HttpStatus.OK
        );
    }
}
