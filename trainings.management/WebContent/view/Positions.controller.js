sap.ui.core.mvc.Controller.extend("com.sap.cloud.requisition.view.Positions", {

	onInit : function() {
		var model = new sap.ui.model.json.JSONModel();
		this.getView().setModel(model, "positions");

	}

});
