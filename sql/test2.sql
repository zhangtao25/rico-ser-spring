create table `user`
(
    `id`          int         not null auto_increment,
    `token`       varchar(32) not null,
    `phone`       varchar(32) not null comment '手机号',
    `email`       varchar(32) not null comment '邮箱',
    `password`    varchar(32) not null comment '密码',
    `nikename`    varchar(32) not null comment '昵称',
    `create_time` timestamp   not null default current_timestamp comment '创建时间',
    `update_time` timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`id`)
) comment '用户表';

create table `userinfo`
(
    `id`          int         not null auto_increment,
    `gender`      int         not null comment '性别',
    `birthday`    varchar(32) not null comment '生日',
    `user_id`     int         not null,
    `create_time` timestamp   not null default current_timestamp comment '创建时间',
    `update_time` timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`id`),
    key `idx_user_id` (`user_id`)
) comment '用户信息表';

create table `job`
(
    `id`          varchar(32) not null,
    `type`        varchar(32) not null comment '类型',
    `status`      int         not null comment '状态',
    `name`        varchar(32) not null comment '作业名',
    `user_id`     int         not null,
    `create_time` timestamp   not null default current_timestamp comment '创建时间',
    `update_time` timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`id`),
    key `idx_user_id` (`user_id`)
) comment '作业表';