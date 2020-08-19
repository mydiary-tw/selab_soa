package tw.com.cardif.selab.web.rest.model;

import tw.com.cardif.selab.domain.Apply;
import tw.com.cardif.selab.web.rest.model.AbstractReportModel;

/**
 * @author Rise Liu
 *
 */
public class ApplyModel extends AbstractReportModel {

	private String applyNo;
	private String channleNo;

	public ApplyModel(Apply apply) {
		this.applyNo = apply.getApplyNo();
		this.channleNo = apply.getChannleNo();
	}

	@Override
	public void toValue(Object value) {
		Apply nvalue = (Apply) value;
		nvalue.setApplyNo(applyNo);
		nvalue.setChannleNo(channleNo);
	}

}
