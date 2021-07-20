CREATE TABLE Topic
(
    id INT PRIMARY KEY NOT NULL,
    title VARCHAR(250)
    
);

CREATE TABLE Post
(
    	id INT PRIMARY KEY NOT NULL,
    	content VARCHAR(250),
	author VARCHAR(250),
   	date DATE,
	Topic_ID INT,
FOREIGN KEY(Topic_ID) REFERENCES Topic(id)

);

INSERT INTO Topic (id, title)
 VALUES
 (1, 'Armand');
 
 
INSERT INTO Post (id, content, author, date, Topic_ID)
 VALUES
 (1, 'Armand', 'Yassine',now(),1);