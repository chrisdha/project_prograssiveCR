package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Cricketer;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public interface CricketerDAO {
    int addCricketer(Cricketer cricketer) throws SQLException;
    Cricketer getCricketerById(int cricketerId) throws SQLException;
    void updateCricketer (Cricketer cricketer) throws SQLException;
    void deleteCricketer (int cricketerId) throws SQLException;
    List<Cricketer> getAllCricketers() throws SQLException;
=======
import java.util.List;

public interface CricketerDAO {
    int addCricketer(Cricketer cricketer);
    Cricketer getCricketerById(int cricketerId);
    void updateCricketer (Cricketer cricketer);
    void deleteCricketer (int cricketerId);
    List<Cricketer> getAllCricketers();
>>>>>>> 4f06e34dfc2e0366bd3b5c08b56117333375e1bc
}