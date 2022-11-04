SELECT * from jaegers;

SELECT * from jaegers
	where status = 'Active';

SELECT * from jaegers
	where mark = 'Mark-1' or mark = 'Mark-3';

SELECT * from jaegers
ORDER BY mark DESC;

SELECT * from jaegers
	where launch = (SELECT MIN(launch) from jaegers);

SELECT * from jaegers
	where kaijukill = (SELECT MIN(kaijukill) from jaegers);

SELECT * from jaegers
	where kaijukill = (SELECT MAX(kaijukill) from jaegers);

SELECT AVG(weight) from jaegers;

UPDATE jaegers
	SET kaijukill = kaijukill + 1
where status = 'Active';

DELETE from jaegers
	where status = 'Destroyed';