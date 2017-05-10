# java_practice
> Solving some classic algorithms problem with java/解决一些经典的算法问题（java语言）
>
## 文档1（Snakeloop.java)
> 蛇形回环矩阵（即图1）的输出实现，解决思路为——逆向思考，蛇形矩阵的实现是从第一行开始由小到大扩展，到中部停止。不同的N之间似乎没有直接关联。而如果看每个数和最大数的差，就会发现，N=K时所成矩阵即为N=（K-2）时所成矩阵向外扩展了一圈的结果（多了两行）。故以此为思路，先构建相减之差的矩阵，再用最大数去减，即可。
> 图示比较直观，为了实现图1，先实现图2。（First get the content of graph_2, then get the content of graph_1)
> ![Alt text](https://github.com/Pengyiqing/java_practice/blob/master/snakeloop_1.png?raw=true "图1/graph_1")
> ![Alt text](https://github.com/Pengyiqing/java_practice/blob/master/snakeloop_2.png?raw=true "图2/graph_2"）

