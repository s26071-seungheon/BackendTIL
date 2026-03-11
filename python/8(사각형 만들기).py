x = int(input("사각형의 크기는 얼마로 할까요?:"))


import turtle
t = turtle. Turtle()
t.shape("turtle")

i = 1
t.setheading(0)
while i <= 4:
    t.fd(x)
    t.left(90)
    i=i+1

turtle.mainloop()
turtle.bye()
