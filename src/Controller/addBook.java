package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Entity.Book;
import Util.HibernateUtil;

/**
 * Servlet implementation class addBook
 */
@WebServlet("/addBook")
public class addBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String book_name = request.getParameter("Name");
		// In the future, the author could be more than 1
		String book_author = request.getParameter("Author");
		String book_state = request.getParameter("State");
		String book_pub_date = request.getParameter("Pub_Date");
		String pages = request.getParameter("Pages");
		int book_pages = Integer.parseInt(pages);
		System.out.println("The name of the book is " + book_name);
		System.out.println("The author of the book is " + book_author);
		System.out.println("The publish date of the book is " + book_pub_date);
		System.out.println("The book has " + book_pages + " pages");
		System.out.println("The book is " + book_state);
		
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			//transaction.begin();
			Book newbook = new Book();
			newbook.setAuthor(book_author);
			newbook.setName(book_name);
			newbook.setPub_date(book_pub_date);
			newbook.setState(book_state);
			newbook.setPages(book_pages);
			session.save(newbook);
			transaction.commit();
			System.out.println("New book inserted sucessessfully");
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
		
		/*Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = null;
		boolean flag = false;
		try {
			transaction = session.beginTransaction();
			List book = session.createQuery("from Book").list();

			for (Iterator iterator = book.iterator(); iterator.hasNext();) {
				Book book1 = (Book) iterator.next();
				if(book1.getName() == request.getParameter("Name")){
					flag = true;
					System.out.println("This book is new!");
				}
			}
			transaction.commit();

		} catch (HibernateException e) {

			transaction.rollback();

			e.printStackTrace();

		} finally {

			HibernateUtil.closeSession(session);

		}*/
		
		
		
		/*if(flag){
			session = HibernateUtil.getCurrentSession();
			transaction = null;

			try {
				transaction = session.beginTransaction();
				//transaction.begin();
				Book newbook = new Book();
				newbook.setAuthor(book_author);
				newbook.setName(book_name);
				newbook.setPub_date(book_pub_date);
				newbook.setState(book_state);
				newbook.setPages(book_pages);
				session.save(newbook);
				transaction.commit();
				System.out.println("New book inserted sucessessfully");
			} catch (HibernateException e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				HibernateUtil.closeSession(session);
			}
		}*/
		/*String location = request.getParameter("location");
		String[] s = request.getParameterValues("location");*/
		
		
	}

}
