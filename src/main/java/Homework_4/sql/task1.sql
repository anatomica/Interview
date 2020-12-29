/**
  Ошибки в расписании (фильмы накладываются друг на друга),
  отсортированные по возрастанию времени.
  Выводить надо колонки «фильм 1», «время начала», «длительность», «фильм 2», «время начала», «длительность»;
*/

select s.date,
       m.name    as movie1,
       s.start,
       s.duration,
       s.stop,
       tab1.name as movie2,
       tab1.start,
       tab1.duration,
       tab1.stop
from sessions as s
         join movies as m on s.movie_id = m.id
         join (select s.date, m.name, s.start, s.duration, s.stop
               from sessions as s
                        join movies as m on s.movie_id = m.id
               order by date, start) as tab1
where s.date = tab1.date
  and tab1.start < s.stop
  and s.start < tab1.start
order by s.date, s.start;