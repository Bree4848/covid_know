<%@ Page Title="STUDENTS REGISTER" Language="C#" MasterPageFile="~/masterpages/FrontEnd.master" AutoEventWireup="true" CodeFile="StudentRegister.aspx.cs" Inherits="StudentRegister" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <p>
        Student register here</p>
    <p>
        <asp:CreateUserWizard ID="CreateUserWizard1" runat="server">
            <WizardSteps>
                <asp:CreateUserWizardStep runat="server" />
                <asp:CompleteWizardStep runat="server" />
            </WizardSteps>
        </asp:CreateUserWizard>
    </p>
</asp:Content>

