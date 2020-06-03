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
    (1, 'Birthday', '1991-08-03', 1),
    (2, 'Anniversary', '2013-06-13', 1),
    (3, 'Midsummer\'s eve', '1991-06-24', 1),
    (4, "Archie's Birthday", '2018-04-06', 1);

INSERT INTO `wishlist_item` VALUES
    (1, 0, 'DS4 Back Button', 35, 'https://media.playstation.com/is/image/SCEA/ds4-back-button-attachement-digital-screen-column-image-01-ps4-16dec19-en-us?$native_md_nt$', 'Back button attachment for PS4 DualShock controller', 'https://www.verkkokauppa.com/fi/product/59787/ndgjt/Sony-Dualshock-4-Back-Button-Attachment-lisavaruste-PS4', 1),
    (2, 0, 'Fanatec CSL Elite PS4 Starter Kit', 570, 'https://fanatec.com/media/image/56/8c/41/B-CSL-E-RWPS4EP_01M1KtqzT4GGYXv_1280x1280.jpg', 'Wheel and pedals set for PS4/PC', 'https://fanatec.com/eu-en/bundles/csl-elite-ps4-starter-kit', 1),
    (3, 0, 'Simetik K2-R Cockpit', 350, 'https://simetik.com/web/wp-content/uploads/2018/11/Tr%C3%A1s-K2R-Completo.jpg', 'Cockpit for wheel and pedal set', 'https://simetik.com/web/product/k2-cockpit/', 1),
    (4, 0, 'A-Category License', 450, 'https://s.err.ee/photo/crop/2018/11/20/567219h8084t2.jpg', 'Motorcycle license', 'https://autosoit.ee/en/juhiload/a-kategooria-mootoratta-juhiluba/', 1),
    (5, 0, 'Primus Lite+ Black', 130, 'https://media.primus.eu/detail/7330033901528_SS17_a_lite_plus_primus_22.jpg', 'Kettle for camping', 'https://www.primus.eu/primus-lite-black-p356006/', 1),
    (6, 0, 'Keb Endurance 2 Tent', 1000, 'https://www.fjallraven.com/globalassets/catalogs/fjallraven/f5/f536/f53602/f616/7323450207120_ss18_a_keb_endurance_2_21.jpg?width=600&height=600&mode=BoxPad&bgcolor=fff&quality=80', 'Tent for hiking', 'https://bit.ly/2U9b1lD', 1);


