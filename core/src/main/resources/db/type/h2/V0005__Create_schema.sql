CREATE TABLE STORY(
id BIGINT NOT NULL AUTO_INCREMENT,
modificationCounter INTEGER NOT NULL,
title VARCHAR(255),
summary VARCHAR(500),
CONSTRAINT PK_Story PRIMARY KEY(id)
);

CREATE TABLE EVENT(
id BIGINT NOT NULL AUTO_INCREMENT,
modificationCounter INTEGER NOT NULL,
content VARCHAR(1000),
CONSTRAINT PK_Event PRIMARY KEY(id)
);

CREATE TABLE STORY_EVENT(
story_id BIGINT NOT NULL,
event_id BIGINT NOT NULL,
CONSTRAINT PK_Story_Event PRIMARY KEY(story_id, event_id),
CONSTRAINT FK_Story FOREIGN KEY(story_id) REFERENCES STORY(id),
CONSTRAINT FK_Event FOREIGN KEY(event_id) REFERENCES EVENT(id)
);