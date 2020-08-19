package tw.com.cardif.selab.web.rest.response;

public interface IResponseObject {

	/**
	 * 將 Response Object 對應為 Value Object
	 * 
	 * @param value Value Object
	 */
	public void toValue(Object value);
}
