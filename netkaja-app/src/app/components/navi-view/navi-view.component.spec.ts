import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NaviViewComponent } from './navi-view.component';

describe('NaviViewComponent', () => {
  let component: NaviViewComponent;
  let fixture: ComponentFixture<NaviViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NaviViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NaviViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
