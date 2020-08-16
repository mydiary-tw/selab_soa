package tw.com.cardif.selab.web.rest.response;

public interface IResponseObject {

	/**
	 * 將 Response Object 對應為 Value Object
	 * 
	 * @return Value Object
	 */
	public Object toValue();
}
