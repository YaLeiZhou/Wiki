drop table if exists `test`;
create table `test` (
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment '名称',
                        `password` varchar(50) comment '密码',
                        primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='开发';

insert into `test` (`id`, `name`, `password`) values (1, 'dev', '111111');

drop table if exists `demo`;
create table `demo` (
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment '名称',
                        primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='开发';

insert into `demo` (`id`, `name`) values (1, 'dev');
