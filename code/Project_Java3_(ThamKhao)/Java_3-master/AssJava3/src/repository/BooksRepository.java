package repository;

import dto.BooksDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.ketNoi;
import model.Users;

public class BooksRepository {

    Connection cn;

    public BooksRepository() {
        cn = ketNoi.Connect("BMS");
    }

    public List<BooksDto> findAllBook(Users user) {
        List<BooksDto> list = new ArrayList<>();
        try {
            if (cn != null) {
                String query = "SELECT A.BOOK_ID,A.TITLE,B.PUB_NAME,C.AU_NAME,A.NOTES "
                        + "FROM PUBLISHERS B INNER JOIN BOOKS A ON A.PUB_ID = B.PUB_ID "
                        + "INNER JOIN AUTHORS C ON A.AU_ID = C.AU_ID\n"
                        + "INNER JOIN USERS D ON A.USERNAME = D.USERNAME WHERE D.USERNAME = ?";

                PreparedStatement ps = cn.prepareStatement(query);

                ps.setString(1, user.getUserName());

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    BooksDto b = new BooksDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                    list.add(b);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BooksDto> findAllBookById(Users user, String text) {
        List<BooksDto> list = new ArrayList<>();
        try {
            if (cn != null) {
                String query = "SELECT A.BOOK_ID,A.TITLE,B.PUB_NAME,C.AU_NAME,A.NOTES "
                        + "FROM PUBLISHERS B INNER JOIN BOOKS A ON A.PUB_ID = B.PUB_ID "
                        + "INNER JOIN AUTHORS C ON A.AU_ID = C.AU_ID\n"
                        + "INNER JOIN USERS D ON A.USERNAME = D.USERNAME "
                        + "WHERE D.USERNAME = ? AND A.BOOK_ID = ?";

                PreparedStatement ps = cn.prepareStatement(query);

                ps.setString(1, user.getUserName());
                ps.setString(2, text);

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    BooksDto b = new BooksDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                    list.add(b);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BooksDto> findAllBookByTitle(Users user, String text) {
        List<BooksDto> list = new ArrayList<>();
        try {
            if (cn != null) {
                String query = "SELECT A.BOOK_ID,A.TITLE,B.PUB_NAME,C.AU_NAME,A.NOTES "
                        + "FROM PUBLISHERS B INNER JOIN BOOKS A ON A.PUB_ID = B.PUB_ID "
                        + "INNER JOIN AUTHORS C ON A.AU_ID = C.AU_ID\n"
                        + "INNER JOIN USERS D ON A.USERNAME = D.USERNAME"
                        + " WHERE D.USERNAME = ? AND A.TITLE LIKE ?";

                PreparedStatement ps = cn.prepareStatement(query);

                ps.setString(1, user.getUserName());
                ps.setString(2, "%" + text + "%");

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    BooksDto b = new BooksDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                    list.add(b);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BooksDto> findAllBookByAuthor(Users user, String text) {
        List<BooksDto> list = new ArrayList<>();
        try {
            if (cn != null) {
                String query = "SELECT A.BOOK_ID,A.TITLE,B.PUB_NAME,C.AU_NAME,A.NOTES "
                        + "FROM PUBLISHERS B INNER JOIN BOOKS A ON A.PUB_ID = B.PUB_ID "
                        + "INNER JOIN AUTHORS C ON A.AU_ID = C.AU_ID\n"
                        + "INNER JOIN USERS D ON A.USERNAME = D.USERNAME"
                        + " WHERE D.USERNAME = ? AND C.AU_NAME LIKE ?";

                PreparedStatement ps = cn.prepareStatement(query);

                ps.setString(1, user.getUserName());
                ps.setString(2, "%" + text + "%");

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    BooksDto b = new BooksDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                    list.add(b);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
