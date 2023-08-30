package web.dao;

import java.sql.SQLException;
import java.util.List;

import web.bean.Commodity;
import web.bean.Comment;

public interface ICommentDao {
	public boolean insert(Comment c) throws SQLException;
	Comment select() throws SQLException;
	List<Comment> load(String cname) throws SQLException;
	List<Comment> load() throws SQLException;
	void delete(int id) throws SQLException;
}