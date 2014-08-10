sap.ui.core.mvc.Controller.extend("com.sap.cloud.requisition.view.Draft", {

	onInit : function() {
		var model = new sap.ui.model.json.JSONModel();
		this.getView().setModel(model, "draft");
	}

});