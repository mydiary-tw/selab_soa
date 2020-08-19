/**
 * 
 */
package tw.com.cardif.selab.web.rest.response;

/**
 * Html Response 抽象物件
 * 
 * @author Rise Liu
 *
 */
public abstract class AbstractResponseObject implements IResponseObject {

	private ResponseMessage message; // 回傳訊息

	public ResponseMessage getMessage() {
		return message;
	}

	public void setMessage(ResponseMessage message) {
		this.message = message;
	}

}
