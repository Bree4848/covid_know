<%@ Page Title="LOGIN" Language="C#" MasterPageFile="~/masterpages/FrontEnd.master" AutoEventWireup="true" CodeFile="Login.aspx.cs" Inherits="Login" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <asp:Login ID="Login1" runat="server" CreateUserText="SIgn up for a new user" CreateUserUrl="~/LadLordRegister.aspx">
    </asp:Login>
</asp:Content>

