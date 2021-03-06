from functools import total_ordering


@total_ordering
class Time:
    def __init__(self, hours: int, minutes: int):
        self._hours = hours
        self._minutes = minutes
        self._warp_minutes()

    @property
    def hours(self):
        return self._hours

    @hours.setter
    def hours(self, hours):
        self._hours = hours

    @property
    def minutes(self):
        return self._minutes

    @minutes.setter
    def minutes(self, minutes):
        self._minutes = minutes
        self._warp_minutes()

    @property
    def raw_minutes(self):
        return self.hours * 60 + self.minutes

    def _warp_minutes(self):
        if self.minutes > 59:
            self.hours += 1
            self.minutes -= 60
        elif self.minutes < 0:
            self.hours -= 1
            self.minutes += 60

    def __add__(self, other):
        return Time(self.hours + other.hours, self.minutes + other.minutes)

    def __sub__(self, other):
        return Time(self.hours - other.hours, self.minutes - other.minutes)

    def __str__(self):
        return '%s:%s' % (str(self.hours).zfill(2), str(self.minutes).zfill(2))

    def __eq__(self, other):
        return self.raw_minutes == other.raw_minutes

    def __lt__(self, other):
        return self.raw_minutes < other.raw_minutes


# Tests
if __name__ == '__main__':
    t = Time(12, 59) + Time(0, 2)
    assert t.hours == 13
    assert t.minutes == 1
    assert Time(9, 0) < Time(10, 0)
    assert Time(10, 0) > Time(9, 0)
    assert Time(12, 59) == Time(12, 59)
