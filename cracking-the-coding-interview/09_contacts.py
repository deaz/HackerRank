# https://www.hackerrank.com/challenges/ctci-contacts

# n = int(input().strip())
# contacts = dict()
# for a0 in range(n):
#     op, contact = input().strip().split(' ')
#     if op == 'add':
#         sub_str = ''
#         for char in contact:
#             sub_str += char
#             if sub_str not in contacts:
#                 contacts[sub_str] = 1
#             else:
#                 contacts[sub_str] += 1
#     elif op == 'find':
#         count = contacts.get(contact, 0)
#         print(count)


# OK, solution with tries


class Node:
    def __init__(self, char):
        self.char = char
        self.children = dict()
        self.count = 0

    def insert(self, word):
        self.count += 1

        if not word:
            return

        if word[0] not in self.children:
            self.children[word[0]] = Node(word[0])
        self.children[word[0]].insert(word[1:])

    def children_count(self, word):
        if not word:
            return self.count
        elif word[0] not in self.children:
            return 0
        else:
            return self.children[word[0]].children_count(word[1:])


n = int(input().strip())
contacts = Node('')
for a0 in range(n):
    op, contact = input().strip().split(' ')
    if op == 'add':
        contacts.insert(contact)
    elif op == 'find':
        print(contacts.children_count(contact))
