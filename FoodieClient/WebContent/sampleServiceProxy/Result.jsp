<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceProxyid" scope="session" class="connection.ServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
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
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        connection.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){
%>
<%=getService10mtemp %>
<%
}else{
        if(getService10mtemp!= null){
        String tempreturnp11 = getService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String sqlquery_1id=  request.getParameter("sqlquery16");
            java.lang.String sqlquery_1idTemp = null;
        if(!sqlquery_1id.equals("")){
         sqlquery_1idTemp  = sqlquery_1id;
        }
        java.lang.String[] getData13mtemp = sampleServiceProxyid.getData(sqlquery_1idTemp);
if(getData13mtemp == null){
%>
<%=getData13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(getData13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(getData13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 18:
        gotMethod = true;
        String firstName_2id=  request.getParameter("firstName21");
            java.lang.String firstName_2idTemp = null;
        if(!firstName_2id.equals("")){
         firstName_2idTemp  = firstName_2id;
        }
        String lastName_3id=  request.getParameter("lastName23");
            java.lang.String lastName_3idTemp = null;
        if(!lastName_3id.equals("")){
         lastName_3idTemp  = lastName_3id;
        }
        boolean updateCategory18mtemp = sampleServiceProxyid.updateCategory(firstName_2idTemp,lastName_3idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateCategory18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 25:
        gotMethod = true;
        String catName_4id=  request.getParameter("catName28");
            java.lang.String catName_4idTemp = null;
        if(!catName_4id.equals("")){
         catName_4idTemp  = catName_4id;
        }
        boolean createCategory25mtemp = sampleServiceProxyid.createCategory(catName_4idTemp);
        String tempResultreturnp26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(createCategory25mtemp));
        %>
        <%= tempResultreturnp26 %>
        <%
break;
case 30:
        gotMethod = true;
        String delName_5id=  request.getParameter("delName33");
            java.lang.String delName_5idTemp = null;
        if(!delName_5id.equals("")){
         delName_5idTemp  = delName_5id;
        }
        boolean deleteCategory30mtemp = sampleServiceProxyid.deleteCategory(delName_5idTemp);
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteCategory30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
break;
case 35:
        gotMethod = true;
        String emailId_6id=  request.getParameter("emailId60");
            java.lang.String emailId_6idTemp = null;
        if(!emailId_6id.equals("")){
         emailId_6idTemp  = emailId_6id;
        }
        String pwd_7id=  request.getParameter("pwd62");
            java.lang.String pwd_7idTemp = null;
        if(!pwd_7id.equals("")){
         pwd_7idTemp  = pwd_7id;
        }
        users.User signin35mtemp = sampleServiceProxyid.signin(emailId_6idTemp,pwd_7idTemp);
if(signin35mtemp == null){
%>
<%=signin35mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">registrationDate:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typeregistrationDate38 = signin35mtemp.getRegistrationDate();
        String tempResultregistrationDate38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeregistrationDate38));
        %>
        <%= tempResultregistrationDate38 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">emailId:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typeemailId40 = signin35mtemp.getEmailId();
        String tempResultemailId40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemailId40));
        %>
        <%= tempResultemailId40 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">city:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typecity42 = signin35mtemp.getCity();
        String tempResultcity42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecity42));
        %>
        <%= tempResultcity42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">membershipId:</TD>
<TD>
<%
if(signin35mtemp != null){
%>
<%=signin35mtemp.getMembershipId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">signupDate:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typesignupDate46 = signin35mtemp.getSignupDate();
        String tempResultsignupDate46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesignupDate46));
        %>
        <%= tempResultsignupDate46 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lastLogin:</TD>
<TD>
<%
if(signin35mtemp != null){
java.util.Calendar typelastLogin48 = signin35mtemp.getLastLogin();
        java.text.DateFormat dateFormatlastLogin48 = java.text.DateFormat.getDateInstance();
        java.util.Date datelastLogin48 = typelastLogin48.getTime();
        String tempResultlastLogin48 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatlastLogin48.format(datelastLogin48));
        %>
        <%= tempResultlastLogin48 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">gender:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typegender50 = signin35mtemp.getGender();
        String tempResultgender50 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typegender50));
        %>
        <%= tempResultgender50 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typepassword52 = signin35mtemp.getPassword();
        String tempResultpassword52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword52));
        %>
        <%= tempResultpassword52 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dob:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typedob54 = signin35mtemp.getDob();
        String tempResultdob54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedob54));
        %>
        <%= tempResultdob54 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typefirstName56 = signin35mtemp.getFirstName();
        String tempResultfirstName56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName56));
        %>
        <%= tempResultfirstName56 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(signin35mtemp != null){
java.lang.String typelastName58 = signin35mtemp.getLastName();
        String tempResultlastName58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName58));
        %>
        <%= tempResultlastName58 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 64:
        gotMethod = true;
        String userid_8id=  request.getParameter("userid67");
        int userid_8idTemp  = Integer.parseInt(userid_8id);
        String fname_9id=  request.getParameter("fname69");
            java.lang.String fname_9idTemp = null;
        if(!fname_9id.equals("")){
         fname_9idTemp  = fname_9id;
        }
        String lname_10id=  request.getParameter("lname71");
            java.lang.String lname_10idTemp = null;
        if(!lname_10id.equals("")){
         lname_10idTemp  = lname_10id;
        }
        String email_11id=  request.getParameter("email73");
            java.lang.String email_11idTemp = null;
        if(!email_11id.equals("")){
         email_11idTemp  = email_11id;
        }
        String passd_12id=  request.getParameter("passd75");
            java.lang.String passd_12idTemp = null;
        if(!passd_12id.equals("")){
         passd_12idTemp  = passd_12id;
        }
        String dob_13id=  request.getParameter("dob77");
            java.lang.String dob_13idTemp = null;
        if(!dob_13id.equals("")){
         dob_13idTemp  = dob_13id;
        }
        String gender_14id=  request.getParameter("gender79");
            java.lang.String gender_14idTemp = null;
        if(!gender_14id.equals("")){
         gender_14idTemp  = gender_14id;
        }
        java.lang.String signUp64mtemp = sampleServiceProxyid.signUp(userid_8idTemp,fname_9idTemp,lname_10idTemp,email_11idTemp,passd_12idTemp,dob_13idTemp,gender_14idTemp);
if(signUp64mtemp == null){
%>
<%=signUp64mtemp %>
<%
}else{
        String tempResultreturnp65 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signUp64mtemp));
        %>
        <%= tempResultreturnp65 %>
        <%
}
break;
case 81:
        gotMethod = true;
        String category_15id=  request.getParameter("category84");
            java.lang.String category_15idTemp = null;
        if(!category_15id.equals("")){
         category_15idTemp  = category_15id;
        }
        users.Item[] displayItem81mtemp = sampleServiceProxyid.displayItem(category_15idTemp);
if(displayItem81mtemp == null){
%>
<%=displayItem81mtemp %>
<%
}else{
        String tempreturnp82 = null;
        if(displayItem81mtemp != null){
        java.util.List listreturnp82= java.util.Arrays.asList(displayItem81mtemp);
        tempreturnp82 = listreturnp82.toString();
        }
        %>
        <%=tempreturnp82%>
        <%
}
break;
case 86:
        gotMethod = true;
        String type_16id=  request.getParameter("type89");
            java.lang.String type_16idTemp = null;
        if(!type_16id.equals("")){
         type_16idTemp  = type_16id;
        }
        String id_17id=  request.getParameter("id91");
        int id_17idTemp  = Integer.parseInt(id_17id);
        String aname_18id=  request.getParameter("aname93");
            java.lang.String aname_18idTemp = null;
        if(!aname_18id.equals("")){
         aname_18idTemp  = aname_18id;
        }
        String aaddress_19id=  request.getParameter("aaddress95");
            java.lang.String aaddress_19idTemp = null;
        if(!aaddress_19id.equals("")){
         aaddress_19idTemp  = aaddress_19id;
        }
        String areview_20id=  request.getParameter("areview97");
            java.lang.String areview_20idTemp = null;
        if(!areview_20id.equals("")){
         areview_20idTemp  = areview_20id;
        }
        String arating_21id=  request.getParameter("arating99");
            java.lang.String arating_21idTemp = null;
        if(!arating_21id.equals("")){
         arating_21idTemp  = arating_21id;
        }
        String acity_22id=  request.getParameter("acity101");
            java.lang.String acity_22idTemp = null;
        if(!acity_22id.equals("")){
         acity_22idTemp  = acity_22id;
        }
        java.lang.String insertFormData86mtemp = sampleServiceProxyid.insertFormData(type_16idTemp,id_17idTemp,aname_18idTemp,aaddress_19idTemp,areview_20idTemp,arating_21idTemp,acity_22idTemp);
if(insertFormData86mtemp == null){
%>
<%=insertFormData86mtemp %>
<%
}else{
        String tempResultreturnp87 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertFormData86mtemp));
        %>
        <%= tempResultreturnp87 %>
        <%
}
break;
case 103:
        gotMethod = true;
        String searchname_23id=  request.getParameter("searchname106");
            java.lang.String searchname_23idTemp = null;
        if(!searchname_23id.equals("")){
         searchname_23idTemp  = searchname_23id;
        }
        String city_24id=  request.getParameter("city108");
            java.lang.String city_24idTemp = null;
        if(!city_24id.equals("")){
         city_24idTemp  = city_24id;
        }
        users.Search[] searchstring103mtemp = sampleServiceProxyid.searchstring(searchname_23idTemp,city_24idTemp);
if(searchstring103mtemp == null){
%>
<%=searchstring103mtemp %>
<%
}else{
        String tempreturnp104 = null;
        if(searchstring103mtemp != null){
        java.util.List listreturnp104= java.util.Arrays.asList(searchstring103mtemp);
        tempreturnp104 = listreturnp104.toString();
        }
        %>
        <%=tempreturnp104%>
        <%
}
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