package com.telusko.SpringJDBCDemo.repo;

import com.telusko.SpringJDBCDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql="insert into student(rollno,name,marks) values(?,?,?)";
        int rows=jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rows +"affected");
    }

    public List<Student> findAll() {

        String sql="select * from student";

            //Interface needs to override mapRow function.
            //It's a converter. Converts 1 row → 1 object
          RowMapper<Student> mapper = new
          RowMapper<Student>() {

          @Override public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s=new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s; }
          };


        //Lambda Function for above function, just like arrow function
//        RowMapper<Student> mapper=(rs, rowNum) ->
//        {
//            Student s=new Student();
//            s.setRollNo(rs.getInt("rollno"));
//            s.setName(rs.getString("name"));
//            s.setMarks(rs.getInt("marks"));
//            return s;
//
//        };

        return jdbc.query(sql, mapper);
    }
}
