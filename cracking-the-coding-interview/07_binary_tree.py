# https://www.hackerrank.com/challenges/ctci-is-binary-search-tree?h_r=next-challenge&h_v=zen

""" Node is defined as
class node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
"""

prev = None


def check_binary_search_tree_(root):
    if root is None:
        return True

    if not check_binary_search_tree_(root.left):
        return False

    global prev

    if prev is not None and root.data <= prev:
        return False
    prev = root.data

    if not check_binary_search_tree_(root.right):
        return False

    return True
