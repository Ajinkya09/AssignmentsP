package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Criteria;
import com.bean.Question;

// Override and implement all the methods of DataManager Interface here
public class DataManagerImpl implements DataManager {

	@Override
	public List<Question> populateData() {
		// TODO Auto-generated method stub

		List<Question> l1 = new ArrayList<Question>();
		Question q = null;

		DatabaseConnectionManager dbobj = new DatabaseConnectionManager();
		Connection con = null;
		String query = "Select * from questionBank";
		PreparedStatement ps = null;

		try {
			con = dbobj.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				q = new Question();
				q.setSrno(rs.getInt(1));
				q.setQuestion(rs.getString(2));
				q.setOption1(rs.getString(3));
				q.setOption2(rs.getString(4));
				q.setOption3(rs.getString(5));
				q.setOption4(rs.getString(6));
				q.setCorrectAns(rs.getString(7));

				for (Category c : Category.values()) {
					if (c.toString().equalsIgnoreCase(rs.getString(8))) {
						q.setType(c);
					}
				}

				for (Complexity cx : Complexity.values()) {
					if (cx.toString().equals(rs.getString(9))) {
						q.setComplexity(cx);
					}
				}
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dbobj.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return l1;
	}

	@Override
	public List<Question> getQuestionByCategory(Category category,
			List<Question> questionsList) {
		// TODO Auto-generated method stub
		List<Question> cal = new ArrayList<Question>();

		for (Question question : questionsList) {
			if (category.equals(question.getCategory())) {
				cal.add(question);
			}
		}

		return cal;
	}

	@Override
	public List<Question> getQuestionByComplexity(Complexity complexity,
			List<Question> questionsList) {
		// TODO Auto-generated method stub
		List<Question> col = new ArrayList<Question>();
		for (Question q : questionsList) {
			if (complexity.equals(q.getComplexity()))
				col.add(q);
		}
		return col;
	}

	@Override
	public Set<Question> generateQuestionPaper(List<Question> list,
			List<Criteria> template) {
		// TODO Auto-generated method stub
		
	Set<Question> qSet = new LinkedHashSet<Question>();
	
	List<Question>tqList = null;
	int count = 0;
	int size;
	int index;
	
	for(Criteria c : template){
		tqList = new ArrayList<Question>();
		
		for (Question q : list) {
			if(c.getComplexity().equals(q.getComplexity())&&c.getCategory().equals(q.getCategory())){
				tqList.add(q);
			}
			
			count += c.getNoOfQuestion();
			
			while(count != qSet.size())
			{
				size = tqList.size();
				index = (int)Math.floor(Math.random() * (double)size);
				qSet.add(tqList.get(index));
			}
		}
		
	}
	
		
		
		return qSet;
	}

	@Override 
	public void sortByCategory(List<Question> questionList) {
		// TODO Auto-generated method stub
		questionList.sort(new Comparator<Question>() {

			@Override
			public int compare(Question o1, Question o2) {
				// TODO Auto-generated method stub
				return o1.getCategory().toString()
						.compareToIgnoreCase(o2.getCategory().toString());
			}
		});

	}

	@Override
	public void sortByComplexity(List<Question> questionList) {
		// TODO Auto-generated method stub
		questionList.sort(new Comparator<Question>() {

			@Override
			public int compare(Question o1, Question o2) {
				// TODO Auto-generated method stub
				return o1.getComplexity().toString()
						.compareToIgnoreCase(o2.getComplexity().toString());
			}
		});
	}

}