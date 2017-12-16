import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DelOrdersViewComponent } from './del-orders-view.component';

describe('DelOrdersViewComponent', () => {
  let component: DelOrdersViewComponent;
  let fixture: ComponentFixture<DelOrdersViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DelOrdersViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DelOrdersViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
