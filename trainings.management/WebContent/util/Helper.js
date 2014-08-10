jQuery.sap.declare("com.sap.cloud.requisition.util.Helper");

jQuery.sap.require("sap.ui.core.format.DateFormat");

com.sap.cloud.requisition.util.Helper = {

	formatDate : function(sDate) {
		var inputDateFormatter = sap.ui.core.format.DateFormat.getDateTimeInstance({
			pattern : "yyyy-MM-dd HH:mm:ss.SSS"
		});

		var outputDateFormatter = sap.ui.core.format.DateFormat.getDateInstance({
			style : "medium"
		});

		var oDate = inputDateFormatter.parse(sDate);
		return oDate && outputDateFormatter.format(oDate);
	}
};
