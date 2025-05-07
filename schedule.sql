use planner;

CREATE TABLE `users` (
                         `id`	bigint	NOT NULL,
                         `name`	varchar(20)	NULL,
                         `email`	varchar(50)	NULL,
                         `user_pw`	varchar(50)	NULL
);

CREATE TABLE `task` (
                        `id`	bigint	NOT NULL,
                        `plan_id`	bigint	NOT NULL,
                        `content`	varchar(200)	NULL
);

CREATE TABLE `plan` (
                        `id`	bigint	NOT NULL,
                        `user_id`	bigint	NOT NULL,
                        `created_at`	timestamp	NULL,
                        `updated_at`	timestamp	NULL,
                        `title`	varchar(20)	NULL
);

ALTER TABLE `users` ADD CONSTRAINT `PK_USERS` PRIMARY KEY (
                                                           `id`
    );

ALTER TABLE `task` ADD CONSTRAINT `PK_TASK` PRIMARY KEY (
                                                         `id`
    );

ALTER TABLE `plan` ADD CONSTRAINT `PK_PLAN` PRIMARY KEY (
                                                         `id`
    );
