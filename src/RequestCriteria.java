/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 4/29/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

public class RequestCriteria
{
	public enum Action {
		ADD,
		REMOVE,
		MODIFY,
		GETPRODUCTS,
		GETEMPLOYEES
	}

	private Action actionToTake;
	private Employee employee;
	private Product product;

	public RequestCriteria(Action actionToTake, Employee employee, Product product)
	{
		this.actionToTake = actionToTake;
		this.employee = employee;
		this.product = product;
	}

	public Action getActionToTake()
	{
		return actionToTake;
	}

	public Employee getEmployee()
	{
		return employee;
	}

	public Product getProduct()
	{
		return product;
	}
}