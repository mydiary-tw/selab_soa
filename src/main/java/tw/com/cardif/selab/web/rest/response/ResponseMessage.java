package tw.com.cardif.selab.web.rest.response;

/**
 * Html response 回傳訊息
 * 
 * @author Rise Liu
 *
 */
public class ResponseMessage {
	String code;
	String message;
	Boolean success;
	ResponseAdditionalInfo additionalInfo;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ResponseAdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(ResponseAdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

}
