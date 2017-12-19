import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DelOrderViewComponent } from './del-order-view.component';

describe('DelOrderViewComponent', () => {
  let component: DelOrderViewComponent;
  let fixture: ComponentFixture<DelOrderViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DelOrderViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DelOrderViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
