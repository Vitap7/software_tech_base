### 各源文件作用

`initialWorldFish.html`：HTML初始页面1

`MySimulation.html`：HTML初始页面2

`web.xml`：配置Servlet

`LivingBeing.java`：Catfish基类

`Catfish.java`：Catfish类定义，继承LivingBeing类，规定鱼的不同状态。实现鱼在存活状态下随机游动，年龄递增

`Simulation.java`：Simulation类定义，传参

`SimulationServlet.java`：SimulationServlet内容实现

`SimulationView.java`：SimulationView类定义，实现跳转后的页面

`MySimulation.java`：MySimulation Servlet实现

`HtmlAnchor.java`：用于在网页中嵌入超链接标签

`HtmlImage.java`：用于在网页中嵌入`<img>`标签

`HtmlPage.java`：网页类定义

`HTMLTable.java`：用于在网页中嵌入`<table>`标签

### 两HTML文件不同之处

`initialWorldFish.html`通过SimulationServlet实现页面跳转，直接跳转到鱼游动界面。`MySimulation.html`通过MySimulation Servlet实现页面跳转，但新页面内容大致相同，再通过SimulationServlet跳转到鱼游动界面。

