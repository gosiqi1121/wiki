drop table if exists `devtest`;
create table `devtest`(
                       `id` bigint not null comment 'id',
                       `name` varchar(50) comment 'name',
                       `password` varchar(50) comment 'password',
                       primary key (`id`)
)engine = innodb default charset = utf8mb4
comment='test';