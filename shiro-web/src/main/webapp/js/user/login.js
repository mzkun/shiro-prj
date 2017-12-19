function registerbtn() {
    $('<div/>').dialog({
        id : 'registDialog',
        href : 'jsp/add.jsp',
        width : 400,
        height : 200,
        modal : true,
        title : '用户注册',
        buttons : [ {
            text : '注册',
            iconCls : 'icon-add',
            handler : function() {
                var button = this;
                var d = $(this).closest('.window-body');
                $('#index_device_register').form('submit', {
                    url : 'user/register',

                    onSubmit: function(){   //对表单进行校验，如果校验通过，则disable掉保存按钮，如果没有通过，则不用管。
                        var isValid = $(this).form('validate');
                        if (!isValid){
                            return isValid;
                        }else {
                            $(button).linkbutton('disable');
                            return isValid;    // return false will stop the form submission
                        }
                    },
                    success : function(result) {
                        $(button).linkbutton('enable');
                        $("#registDialog").dialog('destroy');
                        $('#admin_device_datagrid').datagrid("load");
                        $.messager.show({
                            title : '提示',
                            msg : result
                        });
                    },
                });
            }
        } ],
        onClose : function() {
            $(this).dialog('destroy');
        }
    });
}