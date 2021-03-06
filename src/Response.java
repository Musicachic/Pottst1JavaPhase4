/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 5/6/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import java.io.Serializable;

/**
 * This class contains the response constructor and getters for communication between the client and server. I never
 * got this working.
 */
public class Response implements Serializable
{
	private String header;
	private Serializable payload;

	public Response(String header, Serializable payload)
	{
		this.header = header;
		this.payload = payload;
	}

	public String getHeader()
	{
		return header;
	}

	public Object getPayload()
	{
		return payload;
	}
}
