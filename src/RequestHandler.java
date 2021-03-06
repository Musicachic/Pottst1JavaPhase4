/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 4/29/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import java.io.*;
import java.net.Socket;
import java.util.Collection;
import java.util.List;

/**
 * This class contains the socket to sending data to the server.
 */
public class RequestHandler implements Runnable
{
	private Socket sock;

	public RequestHandler(Socket sock)
	{
		this.sock = sock;

/*		synchronized (counter)
		{
			num = counter;
			counter++;
		}*/
	}

	/**
	 * This method was supposed to do the work to get the data back from the server,
	 * but I couldn't connect it correctly.
	 */
	@Override
	public void run()
	{
		try
		{
			ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(sock.getInputStream()));
			Object o = is.readObject();
			RequestCriteria requestCriteria = (RequestCriteria) o;
			if (requestCriteria.getActionToTake() == RequestCriteria.Action.GETEMPLOYEES)
			{
				//return all employees
				Response response = new Response("SUCCESS", ExtractEmployees.employee);
				ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(sock.getOutputStream()));
				oos.writeObject(response);
				oos.flush();
			}
			else if (requestCriteria.getActionToTake() == RequestCriteria.Action.GETPRODUCTS)
			{
				//return all products
				ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(sock.getOutputStream()));
				List<Employee> employees = null;
				oos.writeObject(employees);
			}
			else if (requestCriteria.getEmployee() != null)
			{
				//EmployeeHandler handler = new EmployeeHandler(employee);
				//handler.handle(action);
				//handleEmployee(employee, action);
			}
			else
			{
				//handle product
			}
		}
		catch (IOException e2)
		{
			e2.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
