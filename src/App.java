/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/9/14
*          # Course Name: CITP 290
*          # Description:
*          ====================================================
*
*
*/

/**
 * This class contains only the main method that calls the methods that will
 * fire off the application.
 */

public class App
{
	/**
	 * This method is the main method that fires off the running of the Phase 4 code if only using the text file
	 * version of the code. This does not integrate with the server or database.
	 */

	public static void main(String[] args)
	{
		AddRemoveEmployeesDisplay.doesFileExist();
		ExtractEmployees.readEmployeeFile();
		ProductAndInventoryDisplay.doesFileExist();
		ExtractProductsAndInventory.readProductFile();
		AskForInput.initialQuestion();
	}
}

