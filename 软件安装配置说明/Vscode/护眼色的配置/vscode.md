# Vscode 豆沙护眼色配置
* ctrl + K   ctrt+t 切换内置主题   内置主题是没有豆沙护眼色主题的，所以需要我们自定义豆沙的护眼色

## 首先下载一个主题。 我下载的是  Atom One Light 主题
* ctrl+shift +p 搜索输入settings 选中（**settings)用户设置** json 格式的  
直接加个逗号然后加入以下语句

```
"workbench.colorCustomizations": {
        "[Atom One Light]": {
            "editor.background": "#C7EDCC",   
	    "sideBar.background": "#C7EDCC",
        "activityBar.background": "#C7EDCC",       
        },
    },
```
不懂之处可以参照   
https://blog.csdn.net/Lean_on_Me/article/details/84552487#commentBox
