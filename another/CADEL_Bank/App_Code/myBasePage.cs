using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for myBasePage
/// </summary>
public class myBasePage: System.Web.UI.Page
{

    private void Page_PreRender (Object sender, EventArgs e)
    {
        if (string.IsNullOrEmpty(this.Title) || this.Title.Equals("Untitled Page",
            StringComparison.CurrentCultureIgnoreCase))
        {
            throw new Exception("Page title caannot be \"Untitled Page\" or an empty string.");
        }
    }
    private void Page_PreInit(object sender, EventArgs e)
    {
        HttpCookie preferredTheme = Request.Cookies.Get("PreferredTheme");
        if(preferredTheme != null)
        {
            string folder = Server.MapPath("~/App_Themes/" + preferredTheme.Value);
            if(System.IO.Directory.Exists(folder))
            {
                Page.Theme = preferredTheme.Value;
            }
        }
    }
    public myBasePage()
    {
        this.PreRender += Page_PreRender;
        this.PreInit += Page_PreInit;
    }
}