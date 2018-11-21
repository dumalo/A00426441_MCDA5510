<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleTrxnWebServiceProxyid" scope="session" class="com.dmalone.mcda5510.service.TrxnWebServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleTrxnWebServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleTrxnWebServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleTrxnWebServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.dmalone.mcda5510.service.TrxnWebService getTrxnWebService10mtemp = sampleTrxnWebServiceProxyid.getTrxnWebService();
if(getTrxnWebService10mtemp == null){
%>
<%=getTrxnWebService10mtemp %>
<%
}else{
        if(getTrxnWebService10mtemp!= null){
        String tempreturnp11 = getTrxnWebService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String f_1id=  request.getParameter("f16");
        float f_1idTemp  = Float.parseFloat(f_1id);
        float addFloat13mtemp = sampleTrxnWebServiceProxyid.addFloat(f_1idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addFloat13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 18:
        gotMethod = true;
        String trxnID_2id=  request.getParameter("trxnID39");
        int trxnID_2idTemp  = Integer.parseInt(trxnID_2id);
        com.dmalone.mcda5510.entity.Transaction getTransaction18mtemp = sampleTrxnWebServiceProxyid.getTransaction(trxnID_2idTemp);
if(getTransaction18mtemp == null){
%>
<%=getTransaction18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">createdBy:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
java.lang.String typecreatedBy21 = getTransaction18mtemp.getCreatedBy();
        String tempResultcreatedBy21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecreatedBy21));
        %>
        <%= tempResultcreatedBy21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
%>
<%=getTransaction18mtemp.getId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">expiryDate:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
java.lang.String typeexpiryDate25 = getTransaction18mtemp.getExpiryDate();
        String tempResultexpiryDate25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeexpiryDate25));
        %>
        <%= tempResultexpiryDate25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">quantity:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
%>
<%=getTransaction18mtemp.getQuantity()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nameOnCard:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
java.lang.String typenameOnCard29 = getTransaction18mtemp.getNameOnCard();
        String tempResultnameOnCard29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenameOnCard29));
        %>
        <%= tempResultnameOnCard29 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">unitPrice:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
%>
<%=getTransaction18mtemp.getUnitPrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPrice:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
%>
<%=getTransaction18mtemp.getTotalPrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">createdOn:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
java.lang.Object typecreatedOn35 = getTransaction18mtemp.getCreatedOn();
        String tempResultcreatedOn35 = org.eclipse.jst.ws.util.JspUtils.markup(typecreatedOn35.toString());
        %>
        <%= tempResultcreatedOn35 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">cardNumber:</TD>
<TD>
<%
if(getTransaction18mtemp != null){
%>
<%=getTransaction18mtemp.getCardNumber()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 41:
        gotMethod = true;
        String trxnID_3id=  request.getParameter("trxnID44");
        int trxnID_3idTemp  = Integer.parseInt(trxnID_3id);
        String name_4id=  request.getParameter("name46");
            java.lang.String name_4idTemp = null;
        if(!name_4id.equals("")){
         name_4idTemp  = name_4id;
        }
        String cardNumber_5id=  request.getParameter("cardNumber48");
            java.lang.String cardNumber_5idTemp = null;
        if(!cardNumber_5id.equals("")){
         cardNumber_5idTemp  = cardNumber_5id;
        }
        String unitPrice_6id=  request.getParameter("unitPrice50");
        double unitPrice_6idTemp  = Double.parseDouble(unitPrice_6id);
        String qty_7id=  request.getParameter("qty52");
        int qty_7idTemp  = Integer.parseInt(qty_7id);
        String totalPrice_8id=  request.getParameter("totalPrice54");
        double totalPrice_8idTemp  = Double.parseDouble(totalPrice_8id);
        String expDate_9id=  request.getParameter("expDate56");
            java.lang.String expDate_9idTemp = null;
        if(!expDate_9id.equals("")){
         expDate_9idTemp  = expDate_9id;
        }
        sampleTrxnWebServiceProxyid.updateTransaction(trxnID_3idTemp,name_4idTemp,cardNumber_5idTemp,unitPrice_6idTemp,qty_7idTemp,totalPrice_8idTemp,expDate_9idTemp);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>