/**
 * 
 */
package tw.com.cardif.selab.web.rest.response;

/**
 * @author Rise Liu
 *
 */
public abstract class AbstractResponseObject implements IResponseObject {

	private ResponseMessage message;

	public ResponseMessage getMessage() {
		return message;
	}

	public void setMessage(ResponseMessage message) {
		this.message = message;
	}

}
