
insert into user (id, created_date, email, last_updated_date, password, username) values (1, '2018-12-28 00:51:33', 'lizak0@live.com', '2018-05-03 13:31:25', 'nkfmVFGsXF', 'munwins0');
insert into user (id, created_date, email, last_updated_date, password, username) values (2, '2019-03-10 14:14:49', 'dchallin1@disqus.com', '2018-08-18 23:35:15', 'U6qZxNg7MHLY', 'fknibb1');
insert into user (id, created_date, email, last_updated_date, password, username) values (3, '2018-08-26 22:38:12', 'enattriss2@wired.com', '2018-06-25 06:20:44', 'x4ZgJPYdr0', 'vchippindale2');
insert into user (id, created_date, email, last_updated_date, password, username) values (4, '2018-08-02 07:39:46', 'tbarrett3@ca.gov', '2018-09-06 13:34:16', 'PNL635jpw', 'ccanniffe3');
insert into user (id, created_date, email, last_updated_date, password, username) values (5, '2018-05-31 22:28:19', 'wverity4@home.pl', '2018-04-20 05:51:20', 'khL3XK', 'epochin4');


insert into post (id, content, creation_date, last_update_time, user_id) values (1, 'In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi.', '2018-08-20 19:23:42', '2018-07-04 08:52:32', 2);
insert into post (id, content, creation_date, last_update_time, user_id) values (2, 'Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', '2018-05-15 05:31:03', '2018-11-24 11:32:11', 3);
insert into post (id, content, creation_date, last_update_time, user_id) values (3, 'Nullam varius. Nulla facilisi.', '2019-01-28 12:46:13', '2018-09-22 06:13:31', 4);
insert into post (id, content, creation_date, last_update_time, user_id) values (4, 'Integer ac leo. Pellentesque ultrices mattis odio.', '2018-08-08 08:34:59', '2019-02-10 02:45:55', 2);
insert into post (id, content, creation_date, last_update_time, user_id) values (5, 'Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', '2019-04-03 09:10:30', '2019-03-31 04:43:50', 2);
insert into post (id, content, creation_date, last_update_time, user_id) values (6, 'Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat.', '2019-02-24 17:19:33', '2019-02-23 22:27:18', 5);
insert into post (id, content, creation_date, last_update_time, user_id) values (7, 'Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue. Vestibulum rutrum rutrum neque.', '2018-10-30 19:20:31', '2018-09-17 11:21:47', 1);
insert into post (id, content, creation_date, last_update_time, user_id) values (8, 'Morbi porttitor lorem id ligula. Suspendisse ornare consequat lectus. In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat. Nulla nisl. Nunc nisl.', '2018-04-23 16:52:27', '2018-06-12 21:30:16', 4);
insert into post (id, content, creation_date, last_update_time, user_id) values (9, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia.', '2018-06-24 04:16:13', '2018-05-11 01:59:49', 2);
insert into post (id, content, creation_date, last_update_time, user_id) values (10, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', '2019-03-26 22:08:44', '2018-05-15 13:06:45', 4);


insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (1, 'Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis.', '2018-04-17 04:53:23', '2018-12-19 16:55:04', 4, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (2, 'Quisque ut erat. Curabitur gravida nisi at nibh.', '2019-04-03 10:06:17', '2019-01-15 16:40:13', 3, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (3, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est.', '2018-11-27 19:07:58', '2019-03-29 17:59:16', 10, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (4, 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', '2019-03-30 14:18:30', '2018-05-10 08:00:08', 6, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (5, 'Sed ante. Vivamus tortor. Duis mattis egestas metus.', '2018-11-19 09:54:03', '2018-07-23 00:00:50', 10, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (6, 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', '2018-07-29 04:33:18', '2018-07-20 23:35:39', 1, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (7, 'Phasellus sit amet erat.', '2018-09-29 00:55:43', '2018-07-01 05:46:57', 5, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (8, 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla.', '2018-04-08 23:34:59', '2019-04-02 02:24:01', 9, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (9, 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.', '2019-03-27 01:59:53', '2018-06-01 11:25:30', 10, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (10, 'Nunc purus. Phasellus in felis.', '2019-01-31 04:39:33', '2019-02-17 11:08:43', 2, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (11, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero.', '2018-05-03 17:30:49', '2018-06-02 09:54:37', 2, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (12, 'Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.', '2018-07-08 05:57:37', '2018-11-28 21:56:26', 1, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (13, 'Duis bibendum. Morbi non quam nec dui luctus rutrum.', '2019-03-20 14:41:49', '2018-05-11 21:43:44', 8, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (14, 'Duis aliquam convallis nunc.', '2018-10-15 03:59:57', '2018-05-29 07:10:22', 9, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (15, 'Praesent blandit.', '2018-08-14 18:29:23', '2018-12-29 03:58:40', 2, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (16, 'Curabitur gravida nisi at nibh.', '2018-09-21 15:21:46', '2018-09-02 21:39:14', 2, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (17, 'In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', '2018-05-29 14:15:42', '2018-05-17 19:34:30', 2, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (18, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus.', '2018-08-30 01:32:12', '2019-02-02 06:48:55', 3, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (19, 'Donec posuere metus vitae ipsum. Aliquam non mauris. Morbi non lectus.', '2018-11-23 08:16:02', '2019-01-28 15:08:30', 10, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (20, 'Nunc purus.', '2018-05-29 15:11:35', '2018-09-30 20:26:57', 3, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (21, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', '2018-09-19 05:25:10', '2019-01-17 21:04:16', 5, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (22, 'Morbi a ipsum. Integer a nibh. In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', '2018-11-26 21:05:35', '2018-08-18 23:03:52', 7, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (23, 'Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.', '2018-10-22 18:27:18', '2019-01-10 18:15:47', 3, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (24, 'Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.', '2018-09-01 18:07:45', '2018-10-26 06:14:01', 7, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (25, 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '2018-10-20 08:08:55', '2019-01-14 15:50:42', 7, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (26, 'Ut at dolor quis odio consequat varius. Integer ac leo. Pellentesque ultrices mattis odio.', '2018-11-09 05:57:52', '2018-10-15 01:02:25', 10, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (27, 'Integer a nibh.', '2018-11-07 15:17:07', '2018-10-04 11:24:39', 7, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (28, 'Donec semper sapien a libero.', '2018-08-31 08:41:42', '2018-09-04 10:37:53', 8, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (29, 'Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis.', '2018-07-01 04:14:33', '2019-01-13 09:47:44', 8, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (30, 'Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula vehicula consequat.', '2018-05-17 19:33:23', '2018-11-11 09:37:36', 2, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (31, 'Morbi a ipsum. Integer a nibh.', '2018-08-27 06:22:35', '2018-09-11 00:15:53', 8, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (32, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue.', '2018-07-07 18:33:57', '2018-10-03 10:15:49', 5, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (33, 'Nam nulla.', '2018-11-13 13:49:24', '2019-02-17 20:00:20', 1, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (34, 'Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est.', '2018-05-11 15:55:52', '2018-05-14 03:42:56', 2, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (35, 'Ut at dolor quis odio consequat varius.', '2018-04-08 11:57:26', '2018-06-23 05:52:45', 5, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (36, 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', '2018-10-10 13:20:36', '2018-12-06 01:26:27', 2, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (37, 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.', '2018-04-30 17:43:55', '2018-09-10 09:51:00', 1, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (38, 'Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy.', '2019-02-12 09:49:02', '2018-07-09 10:28:51', 2, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (39, 'In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', '2018-06-26 01:33:06', '2018-10-15 12:25:08', 6, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (40, 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.', '2019-03-14 00:10:38', '2018-11-25 06:13:14', 5, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (41, 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis.', '2019-02-16 03:22:57', '2018-10-23 13:32:46', 9, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (42, 'Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.', '2018-07-21 05:07:22', '2018-11-13 21:35:37', 6, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (43, 'Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat varius.', '2018-04-26 11:42:38', '2018-10-06 03:20:12', 2, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (44, 'Nulla mollis molestie lorem.', '2018-07-02 15:43:19', '2018-12-20 05:19:40', 3, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (45, 'Suspendisse potenti.', '2018-09-02 00:07:33', '2018-09-29 19:00:58', 3, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (46, 'Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.', '2018-10-09 16:36:08', '2018-08-23 19:53:39', 6, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (47, 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', '2018-07-22 05:00:55', '2019-01-01 05:01:29', 10, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (48, 'Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo.', '2018-05-29 11:27:45', '2018-08-19 17:23:43', 1, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (49, 'Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus.', '2018-06-27 16:30:17', '2018-07-02 14:24:56', 3, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (50, 'Suspendisse potenti.', '2018-05-19 15:47:13', '2018-06-29 22:25:06', 9, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (51, 'Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc.', '2018-12-23 05:03:26', '2019-02-13 06:44:33', 1, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (52, 'Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo.', '2019-01-14 11:52:43', '2018-04-19 22:38:41', 8, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (53, 'Proin eu mi.', '2018-05-13 18:15:06', '2019-03-11 20:26:33', 9, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (54, 'Integer ac neque. Duis bibendum.', '2019-01-26 07:04:36', '2018-08-06 08:18:40', 9, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (55, 'Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.', '2018-05-28 12:34:02', '2018-07-03 09:08:18', 6, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (56, 'Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui.', '2019-02-21 16:50:54', '2018-05-25 13:12:23', 4, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (57, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '2018-08-01 17:31:20', '2019-03-01 16:17:57', 2, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (58, 'Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla.', '2018-10-03 17:14:02', '2018-07-16 16:44:35', 10, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (59, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', '2018-05-04 11:32:08', '2018-09-01 04:00:08', 3, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (60, 'Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia.', '2019-03-30 10:46:54', '2018-06-02 07:29:04', 5, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (61, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue.', '2018-04-21 16:09:00', '2018-04-22 15:36:34', 9, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (62, 'Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', '2018-09-14 17:59:10', '2019-02-24 20:00:25', 6, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (63, 'Maecenas pulvinar lobortis est. Phasellus sit amet erat.', '2018-07-24 21:01:53', '2018-04-14 05:31:57', 4, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (64, 'In hac habitasse platea dictumst.', '2019-01-09 11:37:01', '2018-08-11 11:30:33', 2, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (65, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', '2018-04-30 03:28:56', '2018-07-19 05:27:42', 8, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (66, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.', '2019-02-21 17:37:55', '2019-02-24 09:24:10', 4, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (67, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti. Nullam porttitor lacus at turpis.', '2018-05-26 04:49:07', '2018-06-07 02:57:45', 4, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (68, 'Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis.', '2018-08-07 14:20:14', '2018-11-05 04:32:11', 1, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (69, 'Quisque ut erat.', '2019-04-05 21:53:51', '2019-01-12 21:29:13', 7, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (70, 'Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl. Duis ac nibh.', '2018-11-29 10:40:30', '2018-12-18 20:03:46', 4, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (71, 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla.', '2018-11-30 21:23:00', '2018-08-23 06:40:42', 7, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (72, 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim.', '2019-02-18 02:19:50', '2018-06-13 15:38:33', 10, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (73, 'Vestibulum sed magna at nunc commodo placerat. Praesent blandit.', '2018-09-04 01:21:53', '2018-11-01 13:05:13', 1, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (74, 'Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi.', '2018-11-13 13:47:46', '2018-07-07 15:19:32', 7, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (75, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', '2018-06-11 10:40:30', '2018-05-31 18:43:59', 7, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (76, 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim.', '2019-01-14 08:43:00', '2018-11-15 15:10:56', 4, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (77, 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat.', '2018-08-11 13:44:16', '2019-03-31 15:46:30', 1, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (78, 'Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst.', '2018-09-08 22:18:09', '2019-03-27 16:33:09', 6, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (79, 'Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue.', '2019-02-08 22:38:46', '2018-06-30 01:28:35', 7, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (80, 'Integer ac neque.', '2018-11-12 10:28:53', '2018-09-15 03:58:47', 7, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (81, 'Integer ac leo.', '2018-06-17 11:18:42', '2018-09-17 06:04:54', 7, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (82, 'Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis.', '2018-04-06 00:03:20', '2019-01-21 01:38:55', 4, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (83, 'Donec vitae nisi.', '2018-08-31 17:17:48', '2018-08-13 21:42:24', 2, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (84, 'Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci.', '2018-04-09 02:13:38', '2018-06-02 10:38:09', 1, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (85, 'Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices vel, augue. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque.', '2018-04-09 12:55:47', '2018-09-13 01:11:15', 7, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (86, 'Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus. Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla.', '2019-03-26 10:09:53', '2018-07-22 22:37:03', 5, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (87, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi.', '2018-11-08 23:40:58', '2019-02-05 01:33:37', 4, 2);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (88, 'Vivamus vel nulla eget eros elementum pellentesque.', '2018-12-04 20:28:13', '2018-10-30 01:18:15', 10, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (89, 'In sagittis dui vel nisl.', '2018-12-10 00:58:00', '2019-01-17 15:56:09', 4, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (90, 'Vestibulum sed magna at nunc commodo placerat. Praesent blandit.', '2018-04-25 10:02:47', '2018-09-06 16:16:09', 7, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (91, 'Integer tincidunt ante vel ipsum.', '2019-01-03 02:41:14', '2018-11-12 07:20:19', 4, 5);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (92, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.', '2018-08-30 22:42:04', '2018-12-02 13:28:59', 10, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (93, 'In eleifend quam a odio.', '2018-06-28 15:04:23', '2018-10-04 18:38:18', 3, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (94, 'In blandit ultrices enim.', '2018-08-27 22:07:38', '2019-02-25 01:58:48', 2, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (95, 'Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.', '2018-11-10 17:17:06', '2018-09-28 17:32:20', 1, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (96, 'Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat.', '2018-11-11 14:26:27', '2019-01-13 02:15:06', 2, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (97, 'Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.', '2018-07-12 02:38:49', '2018-05-24 02:48:04', 1, 3);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (98, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui.', '2018-12-17 06:49:00', '2018-05-24 19:51:42', 3, 1);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (99, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend.', '2018-07-06 02:10:17', '2018-07-03 20:51:30', 8, 4);
insert into comment (id, content, creation_date, last_update_date, post_id, user_id) values (100, 'Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue.', '2018-09-15 18:29:48', '2018-11-06 07:17:53', 10, 4);


insert into role (id, name) values (1, 'ROLE_USER');
insert into role (id, name) values (2, 'ROLE_ADMIN');
insert into role (id, name) values (3, 'ROLE_AUTHOR');
insert into role (id, name) values (4, 'ROLE_GUEST');


insert into tag (id, name) values (1, 'JAVA');
insert into tag (id, name) values (2, 'C#');
insert into tag (id, name) values (3, 'C++');
insert into tag (id, name) values (4, 'Design Patterns');
insert into tag (id, name) values (5, 'Spring MVC');
insert into tag (id, name) values (6, 'Spring Security');
insert into tag (id, name) values (7, 'JPA/Hibernate');
insert into tag (id, name) values (8, 'Kotlin');
insert into tag (id, name) values (9, 'Scala');
insert into tag (id, name) values (10, 'Android');

insert into post_tags (tag_id, post_id) values (2, 6);
insert into post_tags (tag_id, post_id) values (10, 7);
insert into post_tags (tag_id, post_id) values (2, 2);
insert into post_tags (tag_id, post_id) values (8, 6);
insert into post_tags (tag_id, post_id) values (4, 7);
insert into post_tags (tag_id, post_id) values (10, 5);
insert into post_tags (tag_id, post_id) values (6, 2);
insert into post_tags (tag_id, post_id) values (7, 2);
insert into post_tags (tag_id, post_id) values (7, 3);
insert into post_tags (tag_id, post_id) values (4, 1);
insert into post_tags (tag_id, post_id) values (5, 5);
insert into post_tags (tag_id, post_id) values (10, 5);
insert into post_tags (tag_id, post_id) values (4, 10);
insert into post_tags (tag_id, post_id) values (3, 2);
insert into post_tags (tag_id, post_id) values (4, 6);
insert into post_tags (tag_id, post_id) values (3, 2);
insert into post_tags (tag_id, post_id) values (1, 8);
insert into post_tags (tag_id, post_id) values (8, 3);
insert into post_tags (tag_id, post_id) values (8, 6);
insert into post_tags (tag_id, post_id) values (4, 5);
insert into post_tags (tag_id, post_id) values (9, 3);
insert into post_tags (tag_id, post_id) values (4, 3);
insert into post_tags (tag_id, post_id) values (10, 5);
insert into post_tags (tag_id, post_id) values (2, 10);
insert into post_tags (tag_id, post_id) values (8, 7);
insert into post_tags (tag_id, post_id) values (1, 10);
insert into post_tags (tag_id, post_id) values (10, 10);
insert into post_tags (tag_id, post_id) values (1, 3);
insert into post_tags (tag_id, post_id) values (7, 4);
insert into post_tags (tag_id, post_id) values (4, 9);
insert into post_tags (tag_id, post_id) values (3, 6);
insert into post_tags (tag_id, post_id) values (10, 10);
insert into post_tags (tag_id, post_id) values (9, 8);
insert into post_tags (tag_id, post_id) values (7, 5);
insert into post_tags (tag_id, post_id) values (9, 5);
insert into post_tags (tag_id, post_id) values (4, 10);
insert into post_tags (tag_id, post_id) values (5, 2);
insert into post_tags (tag_id, post_id) values (9, 9);
insert into post_tags (tag_id, post_id) values (2, 1);
insert into post_tags (tag_id, post_id) values (9, 7);
insert into post_tags (tag_id, post_id) values (6, 9);
insert into post_tags (tag_id, post_id) values (7, 7);
insert into post_tags (tag_id, post_id) values (5, 5);
insert into post_tags (tag_id, post_id) values (9, 7);
insert into post_tags (tag_id, post_id) values (1, 3);
insert into post_tags (tag_id, post_id) values (10, 10);
insert into post_tags (tag_id, post_id) values (7, 1);
insert into post_tags (tag_id, post_id) values (6, 10);
insert into post_tags (tag_id, post_id) values (4, 9);
insert into post_tags (tag_id, post_id) values (7, 5);

insert into users_roles (user_id, role_id) values (1, 4);
insert into users_roles (user_id, role_id) values (4, 4);
insert into users_roles (user_id, role_id) values (3, 2);
insert into users_roles (user_id, role_id) values (2, 5);
insert into users_roles (user_id, role_id) values (2, 1);
insert into users_roles (user_id, role_id) values (5, 1);
insert into users_roles (user_id, role_id) values (4, 4);
insert into users_roles (user_id, role_id) values (4, 1);
insert into users_roles (user_id, role_id) values (3, 4);
insert into users_roles (user_id, role_id) values (2, 2);

