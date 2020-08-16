package tw.com.cardif.selab.web.rest.ro;

import java.util.Properties;

import tw.com.cardif.selab.web.rest.model.ApplyModel;
import tw.com.cardif.selab.web.rest.response.AbstractReportResponseObject;

/**
 * 要保書
 * 
 * @author Rise Liu
 *
 */
public class ApplyRo extends AbstractReportResponseObject {

	public ApplyModel apply; // 預設要保書
	
	public ApplyRo() {
		
	};
	
	@Override
	public Properties toPropertis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object toValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public ApplyModel getApply() {
		return apply;
	}

	public void setApply(ApplyModel apply) {
		this.apply = apply;
	}

}
