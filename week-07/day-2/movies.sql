select * from movie left join rating on movie.mid = rating.mid
left join reviewer on rating.rid=reviewer.rid;

select * from movie;
select * from reviewer;
select * from rating;

/*Find the titles of all movies directed by Steven Spielberg.*/
select  title from Movie
where director like "%spielberg";

/*Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order.*/
select distinct year from Movie 
inner join Rating on Movie.mID=Rating.mID where Rating.stars > 3
order by year asc;

/*Find the titles of all movies that have no ratings.*/
select title from movie
left join rating
on movie.mID = rating.mID 
where stars is null;

/*Some reviewers didn’t provide a date with their 
rating. Find the names of all reviewers who have 
ratings with a NULL value for the date.*/
select name from reviewer left join rating on reviewer.rid = rating.rid where ratingDate is null;

/*Write a query to return the ratings data in a more readable 
format: reviewer name, movie title, stars, and ratingDate. 
Also, sort the data, first by reviewer name, then by movie title,
 and lastly by number of stars.*/
 
 select name, title, stars, ratingDate from movie 
 left join rating on movie.mid = rating.mid 
 left join reviewer on rating.rid = reviewer.rid
 where name is not null
 order by name asc, title asc;
 
 /*For all cases where the same reviewer rated the same movie twice 
 and gave it a higher rating the second time, return the reviewer’s 
 name and the title of the movie.*/
 
 select re.name, m.title 
 from reviewer re 
 left join rating ra 
 on re.rid=ra.rid 
 left join rating ra2 
 on ra.rid=ra2.rid
 left join movie m 
 on m.mid=ra2.mid 
 where ra.mid = ra2.mid 
 and ra.ratingdate > ra2.ratingdate
 and ra.stars > ra2.stars;
 
 /*For each movie that has at least one rating, find the highest 
 number of stars that movie received. Return the movie title and 
 number of stars. Sort by movie title.*/
 
 select m.title, max(r.stars) max from movie m inner join rating r on m.mid = r.mid
 group by m.mid
 order by m.title asc;
 
 /*For each movie, return the title and the ‘rating spread’, that is, 
 the difference between highest and lowest ratings given to that movie. 
 Sort by rating spread from highest to lowest, then by movie title.*/
 
 select m.title, max(r.stars)-min(r.stars) spread from movie m 
 inner join rating r on m.mid = r.mid
 group by m.mid
 order by spread desc, m.title asc;
 
 /*Find the difference between the average rating of movies released before 1980 and 
 the average rating of movies released after 1980. (Make sure to calculate the average 
 rating for each movie, then the average of those averages for movies before 1980 and 
 movies after. Don’t just calculate the overall average rating before and after 1980.)  WIP*/
 
 /*select avg() {select movie m left join rating ra on m.mid = ra.mid 
 where m.year < 1980 left join rating ra2 on m.mid = ra2.mid where m.year};*/
 
 