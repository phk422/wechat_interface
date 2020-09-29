/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.36 : Database - miniprogram
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `friend` */

CREATE TABLE `friend` (
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `img` varchar(225) DEFAULT NULL COMMENT '头像路径',
  `text` varchar(1) DEFAULT NULL COMMENT '名字首字母'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `friend` */

insert  into `friend`(`name`,`img`,`text`) values ('聪哥','/image/friends/cong.png','C');
insert  into `friend`(`name`,`img`,`text`) values ('何老师','/image/friends/he.png','H');
insert  into `friend`(`name`,`img`,`text`) values ('雷军','/image/friends/leijun.png','L');
insert  into `friend`(`name`,`img`,`text`) values ('刘强东','/image/friends/lqd.png','L');
insert  into `friend`(`name`,`img`,`text`) values ('马云','/image/friends/mayun.png','M');
insert  into `friend`(`name`,`img`,`text`) values ('马化腾','/image/friends/mht.png','M');
insert  into `friend`(`name`,`img`,`text`) values ('Penhk','/image/friends/phk.png','P');
insert  into `friend`(`name`,`img`,`text`) values ('乔布斯','/image/friends/jobs.png','Q');

/*Table structure for table `img` */

CREATE TABLE `img` (
  `id` int(11) NOT NULL,
  `path` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `img` */

insert  into `img`(`id`,`path`) values (1,'http://img0.imgtn.bdimg.com/it/u=54226274,2860525018&fm=26&gp=0.jpg');
insert  into `img`(`id`,`path`) values (2,'https://upload-images.jianshu.io/upload_images/2642238-042f5fb08cad0f69.jpg?imageMogr2/auto-orient/strip|imageView2/2/w/600/format/webp');
insert  into `img`(`id`,`path`) values (3,'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1578028484396&di=daa8a0299e9a4bd839e262c6c82bef77&imgtype=0&src=http%3A%2F%2Fdingyue.ws.126.net%2F2019%2F01%2F14%2Fff2a843f0c464fc3a233fbb62d3f4324.jpeg');
insert  into `img`(`id`,`path`) values (3,'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1578028484396&di=64811575428ab62fa388be6ea3bcd83d&imgtype=0&src=http%3A%2F%2Fimg.tukexw.com%2Fimg%2Fab0dfd22373fe240.jpg');
insert  into `img`(`id`,`path`) values (3,'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1578032380467&di=7bfdf4307c49909815c51c62316d0db0&imgtype=0&src=http%3A%2F%2Fg.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F359b033b5bb5c9eacbbf58a4de39b6003af3b32d.jpg');
insert  into `img`(`id`,`path`) values (3,'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1578032402630&di=b242c911fd6412ab3de5c149a48a770c&imgtype=0&src=http%3A%2F%2Fdingyue.nosdn.127.net%2FtGDApwRlorM9FgllKPlIFxXyKl1QPfhOezVIyHKQsxqC01529409395160.jpg');
insert  into `img`(`id`,`path`) values (1,'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2686816370,1238776060&fm=26&gp=0.jpg');
insert  into `img`(`id`,`path`) values (1,'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1578032473552&di=bd461980eb3d9bf7e87490609d768fcf&imgtype=0&src=http%3A%2F%2Fimg.tukexw.com%2Fimg%2F78adfb5dc4b75e9c.jpg');

/*Table structure for table `moments` */

CREATE TABLE `moments` (
  `avaimg` varchar(255) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `imgid` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `moments` */

insert  into `moments`(`avaimg`,`name`,`text`,`imgid`,`address`,`time`) values ('/image/friends/leijun.png','雷军','Are you OK?',1,'北京','刚刚');
insert  into `moments`(`avaimg`,`name`,`text`,`imgid`,`address`,`time`) values ('/image/friends/javadad.png','詹姆斯高斯林','java是世界上最好的语言！！！！！！',2,'美国','20分钟前');
insert  into `moments`(`avaimg`,`name`,`text`,`imgid`,`address`,`time`) values ('/image/friends/mayun.png','马云','我对钱没有兴趣！！！！！',3,'中国','3分钟前');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
