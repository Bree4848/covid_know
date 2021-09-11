using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

/// <summary>
/// Summary description for MyBasePage
/// </summary>
public class MyBasePage:System.Web.UI.Page
{
    private void Page_PreRender(Object sender, EventArgs e)
    {
        if(this.Title=="Untitled Page" || string.IsNullOrEmpty(this.Title))
        {
            throw new Exception("Page title cannto be \"Untitled Page\" or an empty string.");
        }
    }
    public MyBasePage()
    {
        this.PreRender += new EventHandler(Page_PreRender);
    }
}