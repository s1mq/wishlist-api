INSERT INTO `user` (`id`, `username`, `password`, `name`, `photo`, `uuid`) VALUES
    (1, 'admin', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Siim', 'somephoto.jpg', '1267139e-362f-45ad-aed0-29a6f2d88068');

INSERT INTO `group` VALUES
    (1,'Big Friends', 'https://www.markreeveillustrator.com/s/cc_images/cache_2485373340.jpg', 'Upcoming birthdays for my biggest friends', 1),
    (2, 'Gaming pals', 'https://i.pinimg.com/236x/07/3d/71/073d71dbaee93e4ba2fc80810815667a--logo-playstation-gaming-memes.jpg', 'Protagonists from different universes', 1),
    (3, '', '', '', 1);

 INSERT INTO `user_group` VALUES
    (1, 1, 1),
    (2, 1, 2),
    (3, 1, 3);

INSERT INTO `date` VALUES
    (1, 'Birthday', '1991-08-03', 1);

INSERT INTO `wishlist_items` VALUES
    (1, 0, 'Item1', 10, 'somepicture.jpg', 'description description', 'https://www.link.com', 1),
    (2, 0, 'Item2', 10, 'somepicture.jpg', 'description description', 'https://www.link.com', 1),
    (3, 0, 'Item3', 10, 'somepicture.jpg', 'description description', 'https://www.link.com', 1),
    (4, 0, 'Item4', 10, 'somepicture.jpg', 'description description', 'https://www.link.com', 1),
    (5, 0, 'Item5', 10, 'somepicture.jpg', 'description description', 'https://www.link.com', 1),
    (6, 0, 'Item6', 10, 'somepicture.jpg', 'description description', 'https://www.link.com', 1);


