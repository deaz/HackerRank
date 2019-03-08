# https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks


class MyQueue(object):
    def __init__(self):
        self.putted = []
        self.to_pop = []

    def peek(self):
        if not self.to_pop:
            while self.putted:
                self.to_pop.append(self.putted.pop())
        return self.to_pop[-1]

    def pop(self):
        if not self.to_pop:
            while self.putted:
                self.to_pop.append(self.putted.pop())
        self.to_pop.pop()

    def put(self, value):
        self.putted.append(value)


queue = MyQueue()
t = int(input())
for line in range(t):
    values = map(int, input().split())
    values = list(values)
    if values[0] == 1:
        queue.put(values[1])
    elif values[0] == 2:
        queue.pop()
    else:
        print(queue.peek())
