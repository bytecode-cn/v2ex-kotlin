INSERT INTO t_person (`username`, `password`)
VALUES ('testuser', '123456');

INSERT INTO t_node (`name`, `title`)
VALUES
  ('testnode1', 'testtitle1'),
  ('testnode2', 'testtitle2');

INSERT INTO t_topic (`title`, `content`, `composited_by_id`, `node_id`)
VALUES
  ('TEST title1', 'test content1', 1, 1),
  ('TEST title2', 'test content2', 1, 2)
