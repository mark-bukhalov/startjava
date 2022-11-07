SELECT *
  FROM jaegers;

SELECT *
  FROM jaegers
 WHERE status = 'Active';

SELECT * 
  FROM jaegers
  WHERE mark = 'Mark-1'
     OR mark = 'Mark-3';

SELECT *
  FROM jaegers
ORDER BY mark DESC;

SELECT *
  FROM jaegers
 WHERE launch =
       (SELECT MIN(launch)
          FROM jaegers);

SELECT *
  FROM jaegers
 WHERE kaijukill =
       (SELECT MIN(kaijukill)
       FROM jaegers);

SELECT *
  FROM jaegers
 WHERE kaijukill =
	   (SELECT MAX(kaijukill)
	   FROM jaegers);

SELECT AVG(weight)
  FROM jaegers;

UPDATE jaegers
   SET kaijukill = kaijukill + 1
 WHERE status = 'Active';

DELETE
  FROM jaegers
 WHERE status = 'Destroyed';