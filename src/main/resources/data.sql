INSERT INTO `user` (`id`, `username`, `password`, `name`, `photo`, `uuid`) VALUES
    (1, 'admin', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Siim', 'https://i.pinimg.com/originals/50/11/e2/5011e2ab4cf502f55a91ecb84b94376b.jpg', '1267139e-362f-45ad-aed0-29a6f2d88068'),
    (2, 'wallBuilder', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Donald', 'https://p7.hiclipart.com/preview/771/442/451/5bbe18211fff3.jpg', '1267139e-362f-45ad-aed0-29a6f2d88067'),
    (3, 'imdabes', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Barack', 'https://upload.wikimedia.org/wikipedia/commons/1/18/Barack_Obama_-_Caricature_%287372423490%29.jpg', '1267139e-362f-45ad-aed0-29a6f2d88066'),
    (4, 'bestpres007', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'George', 'https://i.pinimg.com/564x/f3/9e/e0/f39ee0e91431c0d0b12f81c5238cb3e4.jpg', '1267139e-362f-45ad-aed0-29a6f2d88065'),
    (5, 'vampire_slayer', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Abraham', 'https://i.pinimg.com/474x/5c/f8/f1/5cf8f147658d2c8b27847839645c8891.jpg', '1267139e-362f-45ad-aed0-29a6f2d88064'),
    (6, 'roach', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Geralt', 'somephoto.jpg', '1267139e-362f-45ad-aed0-29a6f2d88063'),
    (7, 'micah_sucks', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Arthur', 'somephoto.jpg', '1267139e-362f-45ad-aed0-29a6f2d88062'),
    (8, 'iShootArrows', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Aloy', 'somephoto.jpg', '1267139e-362f-45ad-aed0-29a6f2d88061'),
    (9, 'imBetterThanArthur', '$2a$10$iz1QiuSVUMFcXdx5Xs2mr.OdTZBuutK0GrKqWS8x2OhaDz8jKV5ei', 'Jennefer', 'somephoto.jpg', '1267139e-362f-45ad-aed0-29a6f2d88060');

INSERT INTO `user_group` VALUES
    (1, 'Big Friends', 'https://www.markreeveillustrator.com/s/cc_images/cache_2485373340.jpg', 'Upcoming birthdays for my biggest friends', 1),
    (2, 'Gaming pals', 'https://i.pinimg.com/236x/07/3d/71/073d71dbaee93e4ba2fc80810815667a--logo-playstation-gaming-memes.jpg', 'Protagonists from different universes', 1),
    (3, 'Random1', 'https://www.yektravel.com/wp-content/plugins/profilegrid-user-profiles-groups-and-communities/public/partials/images/default-group.png', '', 1),
    (4, 'Random2', 'https://www.yektravel.com/wp-content/plugins/profilegrid-user-profiles-groups-and-communities/public/partials/images/default-group.png', '', 1),
    (5, 'Random3', 'https://www.yektravel.com/wp-content/plugins/profilegrid-user-profiles-groups-and-communities/public/partials/images/default-group.png', '', 1);

 INSERT INTO `user_per_group` VALUES
    (1, 2, 1),
    (2, 3, 1),
    (3, 4, 1),
    (4, 5, 1),
    (5, 6, 2),
    (6, 7, 2),
    (7, 8, 2),
    (8, 9, 2);

INSERT INTO `date` VALUES
    (1, 'Birthday', '1991-08-03', 1),
    (2, 'Anniversary', '2013-06-13', 1),
    (3, 'Midsummer\'s eve', '1991-06-24', 1),
    (4, "Archie's Birthday", '2018-04-06', 1),
    (5, "Birthday", '1946-06-14', 2),
    (6, "4th of July", '1776-07-04', 2);


INSERT INTO `wishlist_item` VALUES
    (1, 0, 'DS4 Back Button', 35, 'https://media.playstation.com/is/image/SCEA/ds4-back-button-attachement-digital-screen-column-image-01-ps4-16dec19-en-us?$native_md_nt$', 'Back button attachment for PS4 DualShock controller', 'https://www.verkkokauppa.com/fi/product/59787/ndgjt/Sony-Dualshock-4-Back-Button-Attachment-lisavaruste-PS4', 1),
    (2, 0, 'Fanatec CSL Elite PS4 Starter Kit', 570, 'https://fanatec.com/media/image/56/8c/41/B-CSL-E-RWPS4EP_01M1KtqzT4GGYXv_1280x1280.jpg', 'Wheel and pedals set for PS4/PC', 'https://fanatec.com/eu-en/bundles/csl-elite-ps4-starter-kit', 1),
    (3, 0, 'Simetik K2-R Cockpit', 350, 'https://simetik.com/web/wp-content/uploads/2018/11/Tr%C3%A1s-K2R-Completo.jpg', 'Cockpit for wheel and pedal set', 'https://simetik.com/web/product/k2-cockpit/', 1),
    (4, 0, 'A-Category License', 450, 'https://www.riigiteataja.ee/aktilisa/0000/1306/0604/13061375.gif', 'Motorcycle license', 'https://autosoit.ee/en/juhiload/a-kategooria-mootoratta-juhiluba/', 1),
    (5, 0, 'Primus Lite+ Black', 130, 'https://media.primus.eu/detail/7330033901528_SS17_a_lite_plus_primus_22.jpg', 'Kettle for camping', 'https://www.primus.eu/primus-lite-black-p356006/', 1),
    (6, 0, 'Keb Endurance 2 Tent', 1000, 'https://www.fjallraven.com/globalassets/catalogs/fjallraven/f5/f536/f53602/f616/7323450207120_ss18_a_keb_endurance_2_21.jpg', 'Tent for hiking', 'https://bit.ly/2U9b1lD', 1),
    (7, 0, 'The Wall', 90000000, 'https://cdn.jwplayer.com/v2/media/hANmKRtg/poster.jpg?width=640', 'Would be nice if it were finished', 'https://en.wikipedia.org/wiki/Trump_wall', 2),
    (8, 1, 'A Wig', 100, 'https://media.wired.com/photos/593244b358b0d64bb35d094a/master/w_3639,c_limit/Megalopygid-Trump-2.jpg', 'A few more strands of hair would be nice', 'https://tradehouse.ee/et/?t=34', 2),
    (9, 0, 'Sunscreen', 10, 'https://hhp-blog.s3.amazonaws.com/2019/07/sunscreen-300x200.jpg', 'Some protection for the burning sun', 'https://www.loverte.com/et/nahahooldus/paike', 2);


