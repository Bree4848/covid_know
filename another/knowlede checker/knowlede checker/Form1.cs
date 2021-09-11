using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace knowlede_checker
{
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();
        }
        

        private void radioButton5_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            txtResuts.Visible = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            txtResuts.Visible = true;
            //txtResuts.Text = "The Capital city of Lesotho is Maseru"+"Capital city of Botswana is Maseru";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            txtResuts.Clear();
            txtResuts.Visible = false;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {
           if(radioButton1.Checked==true)
            {
                txtResuts.Text = "Correct! Maseru is the Capital City of Lesotho";
            }
            else if (radioButton2.Checked == true)
            {
                txtResuts.Text = "Wrong! Maseru is the Capital City of Lesotho";
            }
           else
            {
                txtResuts.Text = "Okay lets pass";
            }
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {

        }
    }
}
